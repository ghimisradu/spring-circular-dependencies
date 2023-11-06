### spring-circular-dependencies
1) Make sure you have a mongodb running on 127.0.0.1:27017
2) Make sure you have a consul agent ready on 127.0.0.1:8500
3) Start the application without any profiles and watch it fail with the following message:
```
The dependencies of some of the beans in the application context form a cycle:

   apiController (field private com.sample.service.ReactiveAutenticationService com.sample.controller.ApiController.reactiveAutenticationService)
      ↓
   reactiveAuthenticationServiceImpl (field private com.sample.repository.AccountRepository com.sample.service.ReactiveAuthenticationServiceImpl.accountRepository)
      ↓
   accountRepository defined in com.sample.repository.AccountRepository defined in @EnableReactiveMongoRepositories declared on ApplicationEntryPoint
┌─────┐
|  reactiveMongoTemplate defined in class path resource [org/springframework/boot/autoconfigure/data/mongo/MongoReactiveDataAutoConfiguration.class]
↑     ↓
|  mappingMongoConverter defined in class path resource [org/springframework/boot/autoconfigure/data/mongo/MongoReactiveDataAutoConfiguration.class]
↑     ↓
|  mongoMappingContext defined in class path resource [org/springframework/boot/autoconfigure/data/mongo/MongoDataConfiguration.class]
↑     ↓
|  consulAutoServiceRegistrationListener defined in class path resource [org/springframework/cloud/consul/serviceregistry/ConsulAutoServiceRegistrationAutoConfiguration.class]
↑     ↓
|  consulAutoServiceRegistration defined in class path resource [org/springframework/cloud/consul/serviceregistry/ConsulAutoServiceRegistrationAutoConfiguration.class]
↑     ↓
|  consulServiceRegistry defined in class path resource [org/springframework/cloud/consul/serviceregistry/ConsulServiceRegistryAutoConfiguration.class]
↑     ↓
|  ttlScheduler defined in class path resource [org/springframework/cloud/consul/support/ConsulHeartbeatAutoConfiguration.class]
↑     ↓
|  actuatorHealthStatusProvider defined in class path resource [org/springframework/cloud/consul/support/ConsulHeartbeatAutoConfiguration$ActuatorBasedApplicationStatusProviderConfig.class]
↑     ↓
|  healthEndpoint defined in class path resource [org/springframework/boot/actuate/autoconfigure/health/HealthEndpointConfiguration.class]
↑     ↓
|  healthContributorRegistry defined in class path resource [org/springframework/boot/actuate/autoconfigure/health/HealthEndpointConfiguration.class]
↑     ↓
|  mongoHealthContributor defined in class path resource [org/springframework/boot/actuate/autoconfigure/data/mongo/MongoReactiveHealthContributorAutoConfiguration.class]
└─────┘

```
