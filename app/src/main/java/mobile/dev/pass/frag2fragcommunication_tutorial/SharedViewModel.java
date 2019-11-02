package mobile.dev.pass.frag2fragcommunication_tutorial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<CharSequence> text = new MutableLiveData<>();

    // method to update live data
    public void setText(CharSequence input) {
        text.setValue(input); // update live data object
    }

    // setup observe method for live data
    public LiveData<CharSequence> getText() {
        return text;  // return live data object
    }

}
