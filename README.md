# Spring
 - 자바 스프링(Spring)은 자바 기반의 오픈 소스 애플리케이션 프레임워크로, 엔터프라이즈 애플리케이션을 개발하기 위한 다양한 기능과 도구를 제공하는 프레임워크입니다.
 - 스프링은 애플리케이션의 구성, 보안, 데이터 액세스, 웹 개발 등 다양한 영역에서 개발자들이 효율적으로 작업할 수 있도록 도와줍니다.

### 프레임워크와 라이브러리의 차이
 - 프레임워크는 개발자가 프레임워크의 규칙과 구조를 따라가며 개발하는 방식으로, 프레임워크가 개발자의 코드 흐름을 제어합니다.
   
    (안 따라하면 안 됨)
 - 라이브러리는 개발자가 필요한 기능을 호출하여 사용하는 방식으로, 개발자가 코드를 제어하며 라이브러리의 기능을 활용합니다.
   
   ( 필요할때 쓰 는 것)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------

- 주요 특징

  - 의존성 주입(Dependency Injection): 스프링은 의존성 주입을 통해 컴포넌트들 간의 결합도를 낮추는데 중점을 둡니다. 이를 통해 유연하고 관리하기 쉬운 코드를 작성할 수 있습니다.

  - AOP(Aspect-Oriented Programming): 관심사의 분리를 지원하는 AOP 개념을 스프링은 강력하게 지원합니다. 이를 통해 코드의 횡단 관심사(예: 로깅, 보안 등)를 모듈화하고 중복을 줄일 수 있습니다.

  - MVC 아키텍처: 스프링은 웹 애플리케이션 개발을 위한 MVC(Model-View-Controller) 아키텍처를 지원합니다. 이를 통해 애플리케이션의 구성 요소들을 분리하여 관리하고 유지보수하기 쉽게 만듭니다.

  - 데이터 액세스 추상화: 스프링은 다양한 데이터베이스 기술과의 통합을 간소화하며, JDBC(Java Database Connectivity)를 편리하게 사용할 수 있는 방법을 제공합니다.

  -  보안: 스프링은 보안 기능을 포함하고 있어 인증과 권한 부여를 쉽게 구현할 수 있습니다.

  - 트랜잭션 관리: 스프링은 선언적인 방식으로 트랜잭션 관리를 할 수 있게 해줍니다. 이를 통해 데이터베이스 작업의 일관성과 안정성을 유지할 수 있습니다.

  - 테스트 지원: 스프링은 단위 테스트와 통합 테스트를 지원하며, 모듈화된 구조 덕분에 테스트하기 용이한 코드를 작성할 수 있습니다. 

  - 다양한 모듈 제공: 스프링은 다양한 모듈로 구성되어 있어 필요한 기능만 선택적으로 사용할 수 있습니다. 예를 들어, 스프링 부트(Spring Boot)는 스프링 애플리케이션의 초기 설정을 간소화하고 개발 생산성을 높이는 도구입니다.

  - 스프링은 높은 유연성과 확장성을 제공하며, 엔터프라이즈급 애플리케이션부터 작은 웹 애플리케이션까지 다양한 종류의 프로젝트에서 사용됩니다.
    
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
# 스프링(Spring) 컨테이너
 
 스프링 프레임워크에서 핵심적인 역할을 수행하는 *컴포넌트로,
 
 스프링 기반 애플리케이션의 런타임 환경을 제공하며 객체의 생명주기와 의존성 관리를 관리합니다. 
 
 스프링 컨테이너는 애플리케이션의 개발과 배포를 좀 더 효율적으로 관리할 수 있도록 돕는 중요한 요소 중 하나입니다.

  ## 주요 역할 & 기능

 - 객체 생성과 관리: 스프링 컨테이너는 애플리케이션에서 사용되는 객체들을 생성하고 관리합니다. 객체의 생성과 소멸 시점을 제어하며, 필요한 시점에 객체를 재사용합니다.
  
 - 의존성 주입(Dependency Injection): 스프링은 의존성 주입(DI)이라는 디자인 패턴을 활용하여 객체들 간의 의존성을 관리합니다. 이를 통해 객체가 직접 의존하는 객체를 생성하지 않고 외부에서 주입받아 사용합니다. 이는 코드의 유연성과 테스트 용이성을 높여줍니다.
  
 - 인스턴스화와 설정: 스프링 컨테이너는 애플리케이션의 설정 정보(XML, 어노테이션 등)를 기반으로 빈(Bean) 객체를 생성하고 설정합니다. 이를 통해 객체 생성과 초기화 과정을 효율적으로 수행할 수 있습니다.
  
 - 싱글톤 관리: 스프링 컨테이너는 빈 객체를 싱글톤으로 관리할 수 있습니다. 따라서 동일한 빈을 여러 번 생성하지 않고 하나의 인스턴스를 재사용함으로써 메모리 사용량을 줄이고 성능을 개선할 수 있습니다.
  
 - AOP(Aspect-Oriented Programming) 지원: 스프링 컨테이너는 AOP를 활용하여 애플리케이션의 횡단 관심사(Cross-cutting Concerns)를 분리하여 관리할 수 있습니다.

스프링 프레임워크에는 여러 가지 종류의 컨테이너가 있으며, 그 중에서 가장 일반적으로 사용되는 두 가지는 "BeanFactory"와 "ApplicationContext"입니다. ApplicationContext는 BeanFactory를 확장한 형태로, 더 다양한 기능과 유용한 기능들을 제공합니다. 스프링 컨테이너를 이용하여 객체의 생명주기와 의존성 관리를 효율적으로 관리할 수 있으며, 개발자가 핵심 비즈니스 로직에 집중할 수 있도록 도와줍니다

## 컴포넌트

 - 컴포넌트(Component): 애플리케이션을 구성하는 부분을 나타내는 개념.
 
 스프링은 애플리케이션을 구성하는 여러 컴포넌트들을 관리하고 연결하는데 사용됩니다.

 컴포넌트는 크게 다음과 같은 의미로 사용됨

 - 스프링 컴포넌트 스캔(Component Scan): 스프링은 컴포넌트 스캔을 통해 클래스들을 검색하고 인식하며, 이를 빈(Bean)으로 등록합니다. 컴포넌트 스캔은 @Component 어노테이션이나 그와 유사한 어노테이션(@Service, @Repository, @Controller 등)을 사용하여 클래스를 스프링의 관리 대상으로 지정하는 것을 의미합니다.
  
 - 컴포넌트 스캔을 통한 빈 등록: 컴포넌트 스캔을 통해 등록된 클래스들은 스프링 컨테이너에 빈으로 등록되어 관리됩니다. 이렇게 등록된 빈들은 스프링의 의존성 주입(Dependency Injection)을 통해 필요한 곳에서 사용될 수 있습니다.
  
- 컴포넌트 기반 아키텍처: 스프링은 컴포넌트 기반 아키텍처를 촉진하며, 이를 통해 애플리케이션의 각 부분을 재사용 가능하고 유지보수가 용이한 모듈로 분리할 수 있습니다. 컴포넌트는 애플리케이션을 논리적으로 구성하는 단위로 사용됩니다.

간단한 예시로, 스프링에서의 컴포넌트는 다음과 같이 사용될 수 있습니다:

```java
Copy code
import org.springframework.stereotype.Component;

@Component
public class UserService {
    // UserService 클래스는 스프링의 컴포넌트로 등록됨
    // 다른 클래스에서 이 빈을 주입하여 사용할 수 있음
}

```

이와 같이 @Component 어노테이션을 사용하여 클래스를 스프링의 컴포넌트로 등록할 수 있습니다. 이후에 등록된 컴포넌트는 스프링 컨테이너에서 관리되며, 필요한 곳에서 사용될 수 있게 됩니다.

.

 ## 빈(Bean)

 "빈(Bean)"은 스프링 컨테이너에 등록되어 관리되는 객체를 의미합니다.
 
 빈은 스프링의 의존성 주입(Dependency Injection) 기능을 활용하여 객체 간의 관계를 설정하고, 애플리케이션의 다양한 부분에서 재사용될 수 있도록 합니다.

 - 주요 특징

   -  객체의 생성과 관리: 빈은 스프링 컨테이너에 의해 생성되고 관리됩니다. 이를 통해 객체의 생명주기와 라이프사이클 관리를 스프링이 담당합니다.
     
   -  의존성 주입(DI): 빈은 의존성 주입을 통해 다른 빈과의 관계를 설정합니다. 이로써 객체 간의 결합도를 낮추고 유연하고 확장 가능한 애플리케이션을 구축할 수 있습니다.
     
   -  스프링 컨테이너에 등록: 빈은 @Component 어노테이션을 비롯한 다양한 어노테이션을 사용하여 스프링 컨테이너에 등록됩니다.
     
   -  싱글톤 기본 설정: 스프링의 기본 빈 스코프는 싱글톤(Singleton)입니다. 따라서 스프링 컨테이너 내에서 동일한 빈은 하나의 인스턴스만 생성되고 공유됩니다.
     
   -  다양한 기능 제공: 빈은 스프링의 다양한 기능을 활용할 수 있는 대상입니다. 예를 들어 AOP(관점 지향 프로그래밍), 트랜잭션 관리 등을 적용할 수 있습니다.
 


