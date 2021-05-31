package com.koreait.java;

public class TvTest {

	//메인메소드
	public static void main(String[] args) {
		//메인메소드는 왜 특별하냐하면 프로그램의 시작점이기때문에!!!
		//이게 없으면 프로젝트가 시작이 안된다
		//이때 까지 메인메소드를 안만들었는데 이유는 톰캣이 시작했기 때문
		//Tv tv = new Tv(1, 1, 1); //->여기 빨간줄이 뜨는 이유는 기본생성자가 없기때문, 
		//그래서 파라미터에 정수를 적는다
		//->이렇게 객체화하는걸 막고 싶을땐 Tv클래스에서
		// abstract를 적는다
		// 추상메소드일때 abstract를 적는데 이럴때도 abstract를적는다   
		Tv lgtv = new LgTv(new AppleSpeaker(40));
		Tv samtv = new SamsungTv(new SonySpeaker(30));
		
		System.out.println(lgtv);
		System.out.println(lgtv.toString()); 
		// 주소값이 나오지 말고 LgTv, 100인치, 40채널, 50볼륨
		System.out.println(samtv.toString()); //SamsungTv, 90인치, 30채널, 40볼륨
		//equals랑 tostring은 모든객체에 다있다!!!!
		//-> 즉 이거는 object에 있다는 뜻이다
		
//		for(int i=0; i<43; i++) {
//			lgtv.channelUp();
//		}
//		-->확인용
		
		for(int i=0; i<55; i++) {
			lgtv.volumeUp();
		}
		
	}

}
