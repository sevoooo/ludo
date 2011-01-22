package ludo.states;

public class State2 implements IState {

	public State2() {
		System.out.println("State2");
	}
	
	public IState handleState() {
		System.out.println("State2 handle");
		IState nextState = new State1();
		return nextState;
	}

}
