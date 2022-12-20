# How to Java Compile Config Setting

[참고블로그](https://reo91004.tistory.com/26)

1. 오라클에서 자바 다운로드 [바로가기](https://www.oracle.com/java/technologies/downloads/)

2. 시스템 환경변수 - 시스템 변수에 변수 추가 
    - 변수 이름 : JAVA_HOME
    - 변수 값 : C:\Program Files\Java\jdk-버전명
    - 변수 이름 : JDK_HOME
    - 변수 값 : C:\Program Files\Java\jdk-버전명
    - 변수 이름 : CLASSPATH
    - 변수 값 : C:\Program Files\Java\jdk-버전명\;.;
    한글 나오게 하려면 아래 변수까지 추가
    - 변수 이름 : JAVA_TOOL_OPTIONS
    - 변수 값 : -Dfile.encoding=utf-8

3. vscode 상에 java extension install 

4. vscode 껐다가 킨뒤, main이 있는 java코드 Run 시키면 정상 작동 한다. 
