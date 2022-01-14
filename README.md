## 비즈니스 요구 사항과 설계
 -회원
  - 회원을 가입하고 조회할 수 있다.
  
  - 회원은 일반과 VIP 두가지 등급이 있다.
  
  - 회원 데이터는 자바 DB를 구축할 수 있고 외부 시스템과 연동할 수 있다.(미확정)
  
-주문과 할인 정책
  - 회원은 상품을 주문할 수 있다.
  
  - 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용해달라(나중에 변경 될 수 있다.)
  
  - 할인 정책은 변경 가능성이 높다 . 회사의 기본 할일 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 최악의 경우 할인을 적용하지 않을 수 도 있다(미확정)
  
  - 인터페이스를 만들고 구현체를 언제든지 갈아끼울 수 있도록 설계하면 된다. 

**회원 클래스 다이어그램**
![](https://images.velog.io/images/jinii/post/5f11203e-d1e3-46ec-b9e4-3bb251aa9fe6/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.07.51.png)

**회원 객체 다이어그램**
![](https://images.velog.io/images/jinii/post/9455e8d1-d2fd-40dc-85fd-0ecd948e7521/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.14.54.png)

**주문 도메인 클래스 다이어그램**
![](https://images.velog.io/images/jinii/post/7742d215-a5a6-4526-b60e-5e3d3cb4dc89/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.13.10.png)

**주문 도메인 객체 다이어그램1**
![](https://images.velog.io/images/jinii/post/c7980b01-bb7a-48c9-b0e5-704e4b607442/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.15.01.png)

**주문 도메인 객체 다이어그램2**
![](https://images.velog.io/images/jinii/post/e6fe50d5-026b-492c-8945-873154e78d83/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.20.02.png)

