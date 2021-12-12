# core

# etc:

EJB → Spring

## Spring

- EJB 컨테이너 대체
- 단순함의 승리
- 현재 사실상 표준기술

## 하이버네이트

- EJB 엔티티빈 기술을 대체
- JPA 새로운 표준을 정의

EJB 엔티티빈 —> 하이버네이트 —> JPA

![](https://images.velog.io/images/jinii/post/0ffa9192-7a6b-4246-990f-8151e59b2734/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%204.45.36.png)
# 스프링 프레임워크

- **핵심 기술** : 스프링 DI 컨테이너 , AOP , 이벤트 , 기타
- **웹 기술** : 스프링 MVC, 스프링 WebFlux
- **데이터 접근 기술** : 트랜잭션, JDBC, ORM , XML
- **기술 통합** : 캐시 , 이메일, 원격 접근, 스케줄링
- **테스트** : 스프링 기반 테스트 지원
- **언어** : 코틀린, 그루비
- 최근에는 스프링 부트를 통해서 스프링 프레임워크의 기술들을 편리하게 사용

# 스프링 단어?

- 스프링 이라는 단어는 문맥에 맞게 사용된다.
    - 스프링 DI 컨테이너 기술
    - 스프링 프레임워크
    - 스프링 부트 , 스프링 프레임워크 등을 모두 포함한 스프링 생태계

# 스프링을 왜 쓰나요?

- 웹 어플리케이션 만들어주고 , DB 에 편하게 접근?
- 전자정부 프레임워크?
- 웹 서버 자동으로 띄워주고?
- 클라우드 ,마이크로 서비스?

# 스프링의 진짜 핵심

- 스프링은 자바 언어 기반의 프레임워크
- 자바 언어의 큰 특징 - 객체 지향 언어
- 스프링은 객체 지향언어가 가진 강력한 특징을 살려내는 프레임워크
- ** 스프링은 좋은 객체 지향 애플리케이션을 만들 수 있도록 도와주는 프레임워크.**

# 객체 지향 특징

- 추상화
- 캡슐화
- 상속
- **다형성**

## 다형성의 실세계 비유

- 실세계와 객체 지향을 1: 1 매칭 X
- 그래도 실세계의 비유로 이해하기에는 좋음
- **역할과 구현**으로 세상을 비유

![](https://images.velog.io/images/jinii/post/96ab4a15-8ca9-49c2-85da-802cec012679/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%204.57.04.png)

![](https://images.velog.io/images/jinii/post/fb91cafd-6a08-400b-96d2-2ea3eff9e594/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%204.57.08.png)
예시 

- 운전자 -자동차
- 공연 무대
- 키보드 , 마우스 , 세상의 표준 인터페이스들
- 정렬 알고리즘
- 할인 로직

## 역할과 구현을 분리

- 역할과 구현으로 분리하면 단순해지고 유연해지며 변경이 용이해진다.
- 장점
    - 클라이언트는 대상의 역할 (인터페이스)만 알면 된다.
    - 클라이언트는 구현 대상의 내부 구조를 몰라도 된다.
    - 클라이언트는 구현 대상의 내부가 변경 되어도 영향을 받지 않는다.
    - 클라이언트는 구현 대상 자체를 변경해도 영향을 받지 않는다.
    

## 자바 언어의 다형성

- 오버라이딩

![](https://images.velog.io/images/jinii/post/0f618095-5869-4a8d-a7f6-bddce42ac524/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-12-12%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%205.00.36.png)

# 다형성의 본질

- 인터페이스를 구현한 객체 인스턴스를 실행 시점에 유연하게 바꿀 수 있다.
- 다형성의 본질을 이해하려면 협력이라는 객체사이의 관계에서 시작
- 클라이언트를 변경하지 않고, 서버의 구현 기능을 유연하게 변경 가능
- 인터페이스를 안정적으로 잘 설계하는 것이 중요
- 한계 : 인터페이스가 변하면 클라이언트 ,서버에 큰 변화 발생

# 스프링과 객체 지향

- 다형성이 가장 중요하다
- 스프링은 다형성을 극대화 시켜준다
- IOC, DI

# 좋은 객체 지향 설계의 5가지 원칙(SOLID)

- **SRP : 단일 책임 원칙**
- **OCP : 개방 - 폐쇄 원칙**
- **LSP : 리스코프 치환 원칙**
- **ISP : 인터페이스 분리 원칙**
- **DIP : 의존 관계 역전 원칙**

## SRP (**Single responsibility principle)**: 단일 책임 원칙

> 예시: 연극을 예시로 들면, 배우 한명이 바뀐다고, 대체 배우를 사용하지  못하고 연극이 진행되지 못하면 SRP 위반 

- 한 클래스는 하나의 책임만을 가져야 한다.
- 하나의 책임이라는 것은 모호하다.
    - 클 수도, 작을 수도 있다.
    - 문맥과 상황에 따라 다르다.
- 중요한 기준은 **변경**이다 .변경이 있을 때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것
- 예) UI 변경, 객체의 생성과 사용을 분리

## OCP(**Open/closed principle) : 개방 -폐쇄 원칙**
> Reposiroty 인터페이스에서 구현한 클래스가 바뀐다고 서비스가 바뀐다면? OCP 위반 

- 소프트웨어 요소는 **확장에는 열려있으나, 변경에는 닫혀있어야 한다**.
- **다형성**을 활용
- 인터페이스를 구현하는 새로운 클래스를 만들어서 새로운 기능을 구현
- **역할과 구현을 분리**

### 문제점

- 구현 객체를 변경하려면 클라이언트 코드를 변경해야 한다.
- 분명 다형성을 사용했지만 OCP 원칙을 지킬 수 없다.
- 객체를 생성하고 연관관계를 맺어주는 별도의 조립, 생성자가 필요하다.

## LSP(**Liskov substitution principle) : 리스코프 치환 원칙**
> 자동차의 인터페이스의 엑셀 기능은 앞으로 가야한다. 뒤로 가게 하면 LSP 위반 , 느리더라도 앞으로 가야함

- 프로그램의 객체는 프로그램의 **정확성을 깨뜨리지 않으면서** 하위 인스턴스 타입으로 변경 가능해야 한다.
- 단순히 컴파일에 성공하는 것을 넘어서는 이야기
- 예) 자동차의 인터페이스의 엑셀 기능은 앞으로 가야한다. 뒤로 가게 하면 LSP 위반 , 느리더라도 앞으로 가야함

## ISP(**Interface segregation principle) : 인터페이스 분리 원칙**
> 자동차 인터페이스를  운전과 정비로 나누고 / 사용자 인터페이스를  운전자 와 정비사로 나누는 것은  ISP의 예시야

- 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나 보다 낫다.
- 자동차 인터페이스 → 운전 인터페이스, 정비 인터페이스
- 사용자 클라이언트 → 운전자 클라이언트 , 정비사 인터페이스로 분리
- **인터페이스가 명확해지고, 대체 가능성이 높아진다.**

## DIP(**Dependency inversion principle) : 의존관계 역전 원칙**
> **클라이언트는 서버의 역할에 의존해야지 구현에 의존하면 안돼~**

- 프로그래머는 "추상화에 의존해야지 구체화에 의존하면 안된다."
- 구체화에 의존하지 말고 추상화에 의존하자

# 다형성 만으로는 OCP, DIP를 지킬 수 없다

실무에서 추상화에 발생하는 비용 고려 → 기능을 확장할 가능성이 없다면 , 구체 클래스를 직접 사용하고 향후 꼭 필요할 때 리팩토링 해서 인터페이스 도입하는 것도 방법