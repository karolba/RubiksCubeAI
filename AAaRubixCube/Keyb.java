
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
 
 
class Keyb {
  
 public static void showVirtualKeyboard(Context c) 
{
  InputMethodManager imm = (InputMethodManager) c.getSystemService(Context.INPUT_METHOD_SERVICE);
  imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
 
}
 public static void hideVirtualKeyboard(Context c  ) 
{
  InputMethodManager imm = (InputMethodManager) c.getSystemService(Context.INPUT_METHOD_SERVICE);
  imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
}
}