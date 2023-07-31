# Food List MVVM 형식으로 구현

 1. MVVM 적용
 2. Retrofit 사용하여 서버에서 데이터 가지고 옴
 3. Hilt사용하여 DI 적용 (학습중)
 4. 매핑해주는 작업을 함수로 짜서 사용
 5. Service -> Repository -> RepositoryImpl

<img src="https://github.com/KamaTAEWOO/FoodListMvvmStudy/assets/48404941/8427cf2e-fe62-43aa-9fbf-8f370366644c" width=400 height=600/>

# FeedBack

1. Backing Property : 사용할 필요가 없었음. Activity에 observe를 사용하지 않았고, Layout에 변수만 추가해주면 되었음.
2. FoodEntity에서 Serialzable 구현한 이유 : Serializable로 구현하는 이유는 객체를 전송할 수 없는 데 Serializable로 인해 객체를 전송할 수 있게 되었고, 지금 상황에서는 객체를 전송할 필요가 없으니 사용할 필요가 없음
3. Hilt Module은 object뿐만 아니라 abstract class도 있음. @Provides와 @Binds가 있는데 두가지 모두 사용해보고 차이점도 반드시 알아야함 (외부라이브러리인 경우 @Provids를 사용하는 것이 맞고, 내부 Interface같은 경우는 @Binds를 사용하는 것이 맞음.)
4. Repository DI같은 경우는 Installin(ViewModelScoped)로 하였는데 ViewModel이 생성할 때마다 같이 생성하는 것을 뜻하는데 굳이 그럴 필요가 없음. SingletonScoped를 사용하면 됨.
