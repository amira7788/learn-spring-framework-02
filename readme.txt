- With time , they were separated out of Jakarta EE vs J2EE vs Java EE
--  J2ee : java 2 Platform Entreprise Edition
--Java EE : Java Platform Entreprise Edition (Rebranding)
--Jakarta EE (Oracle gave Java EE rights to the Eclipse Foundation)

Important Specifications :
--- Jakarata Server Pages => JSP
--- Jakarta Standard Tag Library (JSTL)
--- Jakarta Entreprise Beans (EJB)
--- Jakarata RESTFUL Web Services (JAX-RS)
--- Jakarata Bean Validation
--- Jakarta Context And Dependency Injection (CDI letl 2004)
---Jakarta is supported by Spring 6 and Spring Boot 3
=> we use Jakarta instead of javax
** lifecycle of beans
1/initilization if not lazy
then @PostConstruct
then @PreDestroy

** The Scope: if you want call the same object or create a new object on every call so you have to define a scope:
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) will create a new object ( so a new mac adress) for every call to this object
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) this is for default we have just one object created for all the calls on it

**Important Inject API annotation:
Inject == Autowired
Named == Componant
Qualifier
Scope
Singleton

** Lazy / Eager initialization:
by default it's Eager
if Lazy the initialization won't be happened unless it's not used yet


@Component: for mark beans there are many types on it:
@Service
@Controller
@Repository
By using a specific annotation you are giving more information to the framework about your intentions and optimize dependency's

**
@Configuration:indicate that a class will be used to indicate one or more @Beans methods

@ComponentScan: by default it use the current package

@Bean: the methode product a bean
@Component: the class is a bean
@Service
@repository
@Service

@primary: the component is a priority if multiple candidates
@Qualifier: has the more priority specific by default you can use the same name or the parameter
@Lazy: by default spring is eager initialized
@Scope(bean factory prototype : a new instance will be created every time else by default it's a Singleton
@PostConstruct : after initialization actions
@PreDestroy: you can remove connections before the bean it's moved by the current context
@Named: jakarta CDI annotation = @Component
@Inject: == @Autowired

**Dependency Injection: spring bean need to wire beans together provide IOC 3 types:
Const by default don't need to add @Bean injection it's recommended because the initialization it's done on one methode run
setter injection with @Autowired on setter methods
Field injection: no setter no construction it's called reflection used injection @Autowired BeanType beanparam;

**IOC container : manage the beans and their lifecycle 2 types:
Bean Factory: Basic Spring IOC Container
Application Context: good integration with spring AOP the most used it's simple

**Spring Beans: any object managed by spring

@Autowired: spring search dependency and wire it to the spring bean

**Spring Frameworks : contains multiple Spring Modules:
1- Fundamental Features : Core (IOC Container, Dependency Injection, Auto Wiring..)
2- Web: Spring MVC, Web Application, Rest Api...
3- Web reactive: Spring webFlux etc
4- Data Access: JDBC, JPA etc
5- Integration: JMS..
6- Testing: Mock Objects, Spring MVC Test etc...

=> you can use the module you want to use so you can chose

**Spring Projects:
Spring evolve continuously:
WEB-> Rest api-> microservice. cloud
First project: spring framework
Spring security
Spring Data NoSql and Relational
Spring Integration:
Spring Boot: build microservices easily
Spring cloud

Spring Project-> spring Framework -> Spring Modules

number 1 is spring why:
Loose coupling : between application and make test easy
Reduced Boilerplate Code: focus on Business Logic
Architectural Flexibility: chose what you need on modules
Evolution with Time: Microservice and cloud...



