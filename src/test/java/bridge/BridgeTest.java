package bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class BridgeTest {
    @DisplayName("다리사이즈로 예외의 숫자가 주어졌을 경우")
    @ParameterizedTest
    @ValueSource(strings = {"1","-1","1000","as2","aa"})
    void validateBridgeSize(String input){
        assertThatThrownBy(() -> new Bridge(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}