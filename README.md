# 🗒 온라인 쇼핑몰 서비스

소비자가 상품을 보고 장바구니에 담아 주문할 수 있는 서비스입니다.

## 시나리오
1. 소비자가 회원 가입을 한 후 로그인을 합니다.
2. 소비자가 상품을 검색합니다.
3. 소비자가 상품리스트에서 상품을 선택합니다.
4. 소비자는 상품상세에서 수량을 정하여 장바구니에 담습니다.
5. 소비자는 장바구니에서 주문을 합니다.
6. 소비자는 주문내역을 확입합니다.

## 프로젝트 기능 및 설계
### 소비자
- [ ] 회원가입 
- [ ] 로그인

### 상품
- [ ] 상품 검색
- [ ] 상품 상세 조회

### 장바구니
- [ ] 장바구니에 상품 추가
- [ ] 장바구니에서 상품 삭제
- [ ] 장바구니 조회하기

### 주문
- [ ] 주문 내역 확인하기
- [ ] 주문하기
- [ ] 주문 취소하기

## 기능상세
### 회원
1. 회원 가입 기능 - 아이디, 비밀번호, 이름, 전화번호, 이메일, 주소, 마케팅 수신동의 여부를 저장하여 회원 가입 기능을 구현합니다.
2. 회원 로그인 기능 - 아이디와 비밀번호를 입력하여 로그인을 합니다.

### 상품
1. 상품 검색 기능 - 상품명을 입력 할 경우, 상품 사진, 제목, 가격을 포함한 상품 정보객체 리스트를 반환합니다.
2. 상품 상세 조회 기능 - 상품목록 중에 상품 객체를 선택할 경우 상품상세 정보(상품명, 가격, 상세설명)을 반환합니다.

### 장바구니
1. 장바구니에 추가 기능 - 상품을 상품명과 수량을 함께 장바구니에 추가합니다.
2. 장바구니에서 상품 삭제 기능 - 장바구니에 상품명과 수량을 선택하여 삭제할 수 있습니다.
3. 장바구니 조회 기능 - 장바구니에 담긴 상품의 상품명, 가격, 개수, 총 가격을 보여줍니다.

### 주문 / 결제
1. 주문 기능 - 구매자, 받는 사람, 결제 정보(주문수단, 지불 비용)을 담아 결제를 요청합니다.
2. 주문 취소 기능 - 결제 취소 요청 후 주문기록에 주문이 취소되었음을 갱신합니다.
3. 주문 조회 기능 - 주문목록을 보여줍니다. 주문목록에는 주문일자, 주문 상세가 명시되어 있습니다.

## 예상되는 필요 기술
1. Framework: spring security, JPA, AOP, caching
2. db: H2, MySQL, Redis
3. search: elastic search
4. testing: mockito

## ERD 

![image](https://github.com/syk25/e-cms/assets/129013571/c67d97a8-6a26-4793-87ad-6bffa8763a88)

## 문제 대응
[문제 대응 모음]()

### 기술스택
<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>


