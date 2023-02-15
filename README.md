# food-delivery






대상 마이크로서비스 : 고객 , 상점주 , 라이더
■
Microservice Implementation
1. Saga (Pub / Sub)
 아래는 PUB/SUB 구현된 코드
![1 Saga](https://user-images.githubusercontent.com/16378278/218912732-2269d8d5-5591-4b66-8dab-b2f424442ea4.PNG)


2. CQRS
아래는 CQRS 구현된 코드
![2 CQRS](https://user-images.githubusercontent.com/16378278/218912735-4dd8aa9e-df8b-4174-9dee-4509a0e5c587.PNG)

3. Compensation / Correlation
주문 및 취소 결과 kafka console 로그
![3 Compensation_Correlation](https://user-images.githubusercontent.com/16378278/218912742-57b7ca19-1137-487b-bfab-07ca86a3cca3.PNG)

■
Microservice Orchestration
1. Deploy to EKS Cluster
 deploy된 목록
![1 deploy](https://user-images.githubusercontent.com/16378278/218912724-198e2c6c-4e6a-4a44-a031-d14a371d2053.PNG)
 gateway를 통해 주문 성공하는 화면
![1 deploy_cheeck](https://user-images.githubusercontent.com/16378278/218912729-4254145c-3d11-4b11-bbb0-6e276b3f9c2f.PNG)


2.Gateway Service Router 설치
deploy된 gateway
![2 gateway](https://user-images.githubusercontent.com/16378278/218912736-bacaf195-cd70-4cc7-9d5e-f6d4f2374b2d.PNG)

3.
Autoscale (HPA)
 autoscaling command 입력 및 변경된 내용
![3 autoscaling](https://user-images.githubusercontent.com/16378278/218912740-2ad31080-4dd2-4ca1-a7e8-2361331b3d22.PNG)
 현재 하나의 front pod 확인
![3 pod](https://user-images.githubusercontent.com/16378278/218912749-0645c8ad-8be9-4206-a36b-4fbf9a1a144f.PNG)
 siege 사용 전
![3 hpa](https://user-images.githubusercontent.com/16378278/218912745-2b14120d-cefe-40ec-8ec6-2901b932b108.PNG)
 siege 사용 후
![3 hpa_2](https://user-images.githubusercontent.com/16378278/218912748-3f19e7a4-597b-40db-bec0-52690b6f75dd.PNG)
 pod 갯수 증가 
![3 auto](https://user-images.githubusercontent.com/16378278/218912738-f43497e7-746e-4163-8516-7abe41a0b8df.PNG)



