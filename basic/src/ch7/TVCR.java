// 자바는 복잡함때문에 불편하더라도 단일상속만허용한다.
package ch7;
class Tv2 {
	boolean power; 	// 전원상태(on/off)
	int channel;		// 채널

	void power()       { 	power = !power; }
	void channelUp()   { 	++channel; 		}
	void channelDown() {	--channel; 		}
}

//같은 내용의 메서드가 존재할 때는?? 
class VCR {
	boolean power; 	// 전원상태(on/off)
   int counter = 0;
	void power() { 	power = !power; }
	void play()  { /* 내용생략*/ }
	void stop()  { /* 내용생략*/ }
	void rew()   { /* 내용생략*/ }
	void ff()    { /* 내용생략*/ }
}

class TVCR extends Tv2 {
	VCR vcr = new VCR();
	int counter = vcr.counter;

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
   }

	void rew() {
		vcr.rew();
   }

	void ff() {
		vcr.ff();	
   }
}
