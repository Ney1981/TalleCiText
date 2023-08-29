import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.calculator.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class CalculatorInstrumentedTest {

    @Rule
    public ActivityTestRule<CalculatorActivity> activityRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void testCalculator() {
        // Realiza una serie de acciones con Espresso para probar la calculadora
        Espresso.onView(ViewMatchers.withId(com.example.calculator.R.id.button1)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttonAdd)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.buttonAdd)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button3)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView)).check(ViewAssertions.matches(ViewMatchers.withText("1+2+3")));

        // Puedes agregar más acciones y comprobaciones según tus necesidades
    }
}
