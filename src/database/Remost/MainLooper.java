package database.Remost;

import database.isaac.CheckCmd;

public class MainLooper {
	private boolean flag = true;
	private Input ip = null;
	private CheckCmd checkCmd = null;

	public MainLooper() {
		super();
//		ip = new Input();
	}

	public void loop(String Command) {
		ip = new Input();
		checkCmd = new CheckCmd();
		int checkReturn;
		String ipStream;
		while (flag) {
			ipStream = ip.getInputLine();
			checkReturn = checkCmd.check(ipStream);
			if (checkReturn == -1) {
				flag = false;
			}

		}
	}

	public void Remostloop(String Command) {
		checkCmd = new CheckCmd();
		int checkReturn;
		String ipStream;
		while (flag) {
			ipStream = Command;
			checkReturn = checkCmd.check(ipStream);
			if (checkReturn == -1) {
				flag = false;
			}

		}
	}
}
