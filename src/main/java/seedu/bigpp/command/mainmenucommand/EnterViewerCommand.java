package seedu.bigpp.command.mainmenucommand;

import seedu.bigpp.command.Command;
import seedu.bigpp.ui.UI;

public class EnterViewerCommand extends Command {

    @Override
    public String executeCommand() {
        UI.setViewerMode();
        return "Changed to viewer mode";
    }
}
