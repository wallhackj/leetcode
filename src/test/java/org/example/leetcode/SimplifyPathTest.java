package org.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SimplifyPathTest {
    @ParameterizedTest
    @CsvSource({
            "/home/, /home",
            "/home//foo/, /home/foo",
            "/home/user/Documents/../Pictures, /home/user/Pictures",
            "/../, /",
            "/.../a/../b/c/../d/./, /.../b/d"
    })
    void simplifyPath1(String problem, String solution) {
        assertThat(SimplifyPath.simplifyPath(problem)).isEqualTo(solution);
    }
}