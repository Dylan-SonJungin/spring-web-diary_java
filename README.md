### 다이어리명

---

### 기능
- 예외처리
    - 프론트단에서 빨간글씨로 출력(예외 시, 텍스트 박스 초기화)

- 로그인
    - 아이디, 비밀번호 입력
    - 아이디랑 비밀번호가 맞는지 아닌지


- 회원가입
    - 아이디, 비밀번호, 닉네임
    - 아이디 길이, 한글 유무 등등
    - 아이디 중복 체크
    - 비밀번호 확인(2개 받고 맞는지 아닌지)


- 달력
    - 화면 출력은 팝업
    - 글 입력 화면(제목, 날짜, 기분, 텍스트 박스)
    - placeholder 설정
        - 제목 : 제목을 입력하세요
        - 내용 : 오늘의 기분을 표현해주세요!
    - 글자수 제한
        - 제목 : 30자
        - 내용 : 200자
    - 기분(selectbox or list) 이모티콘 선택
    - 글 수정
    - 스티커(작성 완료 표시, 기타 등등...)
    - todo 리스트?

- 로그아웃


---

### DB


---

### 제약사항

**커밋 메세지 규칙**

- feat : 새로운 기능 추가
- fix : 버그 수정
- refactor : 코드 리펙토링
- test : 테스트 코드, 리펙토링 테스트 코드 추가


**브랜치 규칙**

- 신규 기능 추가
  - features/기능명(소문자)

- 개발 테스트
  - dev

- 최종본
  - master