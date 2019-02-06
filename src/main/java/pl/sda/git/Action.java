package pl.sda.git;

import java.util.List;

public interface Action {
	String doIt(List<String> actionInput);
}
