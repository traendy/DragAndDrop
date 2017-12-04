package dev.traendy.de.draganddrop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by speters on 03.12.17.
 */

public class UserData {
        private List<Ticket> usersList = new ArrayList<Ticket>() {
            {
                add(new Ticket(0, "", Type.IN_PROGRESS, null, 0));
                add(new Ticket(1, "Nichts", Type.IN_PROGRESS, null, 0));
                add(new Ticket(2, "Nichts", Type.IN_PROGRESS, null, 0));
                add(new Ticket(3, "Nichts", Type.IN_PROGRESS, null, 0));
                add(new Ticket(4, "Nichts", Type.IN_PROGRESS, null, 0));
                add(new Ticket(5, "Nichts", Type.IN_PROGRESS, null, 0));
                add(new Ticket(6, "", Type.WAITING, null, 0));
                add(new Ticket(7, "Nichts", Type.WAITING, null, 0));
                add(new Ticket(8, "Nichts", Type.WAITING, null, 0));
                add(new Ticket(9, "Nichts", Type.WAITING, null, 0));
                add(new Ticket(10, "Nichts", Type.WAITING, null, 0));
                add(new Ticket(11, "Nichts", Type.WAITING, null, 0));
                add(new Ticket(12, "", Type.NEW, null, 0));
                add(new Ticket(13, "Nichts", Type.NEW, null, 0));
                add(new Ticket(14, "Nichts", Type.NEW, null, 0));
                add(new Ticket(15, "Nichts", Type.NEW, null, 0));
                add(new Ticket(16, "Nichts", Type.NEW, null, 0));
                add(new Ticket(17, "Nichts", Type.NEW, null, 0));
                add(new Ticket(18, "", Type.READY_FOR_DEF, null, 0));
                add(new Ticket(19, "Nichts", Type.READY_FOR_DEF, null, 0));
                add(new Ticket(20, "Nichts", Type.READY_FOR_DEF, null, 0));
                add(new Ticket(21, "Nichts", Type.READY_FOR_DEF, null, 0));
                add(new Ticket(22, "Nichts", Type.READY_FOR_DEF, null, 0));
            }
        };

        public List<Ticket> getUsersList() {
            return usersList;
        }
}
