package camp.nextstep.edu.calculator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.* // ktlint-disable no-wildcard-imports
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

/**
 * @author 박소연
 * @created 2023/01/31
 * @updated 2023/02/15
 * @desc 계산기 UI 테스트
 */

class CalculatorActivityTest {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(CalculatorActivity::class.java)

    @Test
    fun 초기_상태에서_0을_누르면_0이_보인다() {
        // when: '0' 버튼을 누르면
        onView(withId(R.id.button0)).perform(click())

        // then: '0'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("0")))
    }

    @Test
    fun 초기_상태에서_1를_누르면_1이_보인다() {
        // when: '1' 버튼을 누르면
        onView(withId(R.id.button1)).perform(click())

        // then: '1'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("1")))
    }

    @Test
    fun 초기_상태에서_2를_누르면_2가_보인다() {
        // when: '2' 버튼을 누르면
        onView(withId(R.id.button2)).perform(click())

        // then: '2'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("2")))
    }

    @Test
    fun 초기_상태에서_3을_누르면_3이_보인다() {
        // when: '3' 버튼을 누르면
        onView(withId(R.id.button3)).perform(click())

        // then: '3'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("3")))
    }

    @Test
    fun 초기_상태에서_4를_누르면_4이_보인다() {
        // when: '4' 버튼을 누르면
        onView(withId(R.id.button4)).perform(click())

        // then: '4'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("4")))
    }

    @Test
    fun 초기_상태에서_5를_누르면_5가_보인다() {
        // when: '5' 버튼을 누르면
        onView(withId(R.id.button5)).perform(click())

        // then: '5'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("5")))
    }

    @Test
    fun 초기_상태에서_6을_누르면_6이_보인다() {
        // when: '6' 버튼을 누르면
        onView(withId(R.id.button6)).perform(click())

        // then: '6'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("6")))
    }

    @Test
    fun 초기_상태에서_7을_누르면_7이_보인다() {
        // when: '7' 버튼을 누르면
        onView(withId(R.id.button7)).perform(click())

        // then: '7'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("7")))
    }

    @Test
    fun 초기_상태에서_8을_누르면_8이_보인다() {
        // when: '8' 버튼을 누르면
        onView(withId(R.id.button8)).perform(click())

        // then: '8'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("8")))
    }

    @Test
    fun 초기_상태에서_9를_누르면_9가_보인다() {
        // when: '9' 버튼을 누르면
        onView(withId(R.id.button9)).perform(click())

        // then: '9'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("9")))
    }

    @Test
    fun 입력된_수식이_없을때_1을_누르면_1이_보인다() {
        // given : 입력된 수식이 없을 때

        // when: '1' 버튼을 누르면
        onView(withId(R.id.button1)).perform(click())

        // then: '1'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("1")))
    }

    @Test
    fun 입력된_값이_5_더하기_일때_1을_누르면_5_더하기_1이_보인다() {
        // given : 입력된 수식 '1+' 일때
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())

        // when: '1' 버튼을 누르면
        onView(withId(R.id.button1)).perform(click())

        // then: '1+1'이 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("1 + 1")))
    }

    @Test
    fun 입력된_값이_8일때_9를_누르면_89가_보인다() {
        // given : 입력된 수식이 '8' 일때
        onView(withId(R.id.button8)).perform(click())

        // when: '9' 버튼을 누르면
        onView(withId(R.id.button9)).perform(click())

        // then: '89'가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("89")))
    }

    @Test
    fun 입력된_값이_없을때_플러스를_누르면_보이지_않는다() {
        // given : 입력된 수식 없을때

        // when: '+' 버튼을 누르면
        onView(withId(R.id.buttonPlus)).perform(click())

        // then: 안보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("")))
    }

    @Test
    fun 입력된_값이_1일때_플러스를_누르면_1_플러스가_보인다() {
        // given : 입력된 수식이 '1'일때
        onView(withId(R.id.button1)).perform(click())

        // when: '+' 버튼을 누르면
        onView(withId(R.id.buttonPlus)).perform(click())

        // then: '1+'가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("1 +")))
    }

    @Test
    fun 입력된_값이_1_플러스일때_마이너스를_누르면_1_마이너스가_보인다() {
        // given : 입력된 수식이 '1+'일때
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())

        // when: '-' 버튼을 누르면
        onView(withId(R.id.buttonMinus)).perform(click())

        // then: '1-'가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("1 -")))
    }

    @Test
    fun 입력된_값이_없을때_지우기를_누르면_변화가_없다() {
        // given : 입력된 수식이 ''일때

        // when: '지우기' 버튼을 누르면
        onView(withId(R.id.buttonDelete)).perform(click())

        // then: ''가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("")))
    }

    @Test
    fun 입력된_값이_32_플러스_1일때_지우기를_누르면_32_플러스가_보인다() {
        // given : 입력된 수식이 '32+1'일때
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())
        onView(withId(R.id.button1)).perform(click())

        // when: '지우기' 버튼을 누르면
        onView(withId(R.id.buttonDelete)).perform(click())

        // then: '32+'가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("32 +")))
    }

    @Test
    fun 입력된_값이_32_플러스_1일때_지우기를_두번_누르면_32이_보인다() {
        // given : 입력된 수식이 '32+1'일때
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())
        onView(withId(R.id.button1)).perform(click())

        // when: '지우기' 버튼을 두번 누르면
        onView(withId(R.id.buttonDelete)).perform(click())
        onView(withId(R.id.buttonDelete)).perform(click())

        // then: '32'가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("32")))
    }

    @Test
    fun 입력된_식이_3_플러스_2로_온전할때_계산을_누르면_결과가_보인다() {
        // given : 입력된 수식이 '3+2'일때
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())
        onView(withId(R.id.button2)).perform(click())

        // when: '=' 버튼을 누르면
        onView(withId(R.id.buttonEquals)).perform(click())

        // then: '5'가 보여야 한다
        onView(withId(R.id.textView)).check(matches(withText("5")))
    }
}