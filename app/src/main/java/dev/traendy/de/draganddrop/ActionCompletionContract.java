package dev.traendy.de.draganddrop;

/**
 * Created by speters on 01.12.17.
 */

public interface ActionCompletionContract {
    void onViewMoved(int oldPosition, int newPosition);
    void onViewSwiped(int position);
}
