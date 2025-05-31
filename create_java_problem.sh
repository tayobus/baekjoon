#!/bin/bash
# 이 스크립트는 백준 자바 문제를 위한 디렉토리와 템플릿 파일을 생성합니다.

# 인자로 문제 번호를 받음
problem_number=$1

if [ -z "$problem_number" ]; then
    echo "사용법: ./create_java_problem.sh <문제번호>"
    exit 1
fi

# 디렉토리가 이미 존재하는지 확인
if [ -d "$problem_number" ]; then
    echo "경고: 문제 $problem_number 디렉토리가 이미 존재합니다."
    read -p "덮어쓰시겠습니까? (y/n): " overwrite
    
    if [ "$overwrite" != "y" ] && [ "$overwrite" != "Y" ]; then
        echo "작업을 취소합니다."
        
        # 기존 파일을 VS Code에서 열기
        if [ -f "$problem_number/Main.java" ]; then
            echo "기존 Main.java 파일을 엽니다."
            code "$problem_number/Main.java"
        fi
        
        exit 0
    fi
fi

# 디렉토리 생성 (이미 존재하더라도 오류 없음)
mkdir -p "$problem_number"

# Main.java 파일 생성 및 기본 템플릿 추가
cat > "$problem_number/Main.java" << 'EOF'
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {



        bw.flush();
        bw.close();
    }
}
EOF

echo "자바 문제 $problem_number 디렉토리와 Main.java 파일이 생성되었습니다."

# VS Code로 파일 열기
code -n -g "$problem_number/Main.java:9:9"
