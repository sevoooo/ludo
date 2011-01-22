package ludo.states;

public class State1 implements IState {

	public State1() {
		System.out.println("State1");
	}
	
	public IState handleState() {
		System.out.println("State1 handle");
		IState nextState = new State2();
		return nextState;
	}

}
