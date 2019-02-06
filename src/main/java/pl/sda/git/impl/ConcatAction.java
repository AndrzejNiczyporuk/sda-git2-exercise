package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ConcatAction  implements Action {
	@Override
	public String doIt(List<String> actionInput) {
		return String.join("", actionInput);
	}
}
