package ch7;
class Tv2 {
	boolean power; 	// ��������(on/off)
	int channel;		// ä��

	void power()       { 	power = !power; }
	void channelUp()   { 	++channel; 		}
	void channelDown() {	--channel; 		}
}

class VCR {
	boolean power; 	// ��������(on/off)
   int counter = 0;
	void power() { 	power = !power; }
	void play()  { /* �������*/ }
	void stop()  { /* �������*/ }
	void rew()   { /* �������*/ }
	void ff()    { /* �������*/ }
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
