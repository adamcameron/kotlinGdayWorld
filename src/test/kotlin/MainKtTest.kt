package gdayWorld.test

import com.github.stefanbirkner.systemlambda.SystemLambda.*
import gdayWorld.*
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MainKtTest : DescribeSpec({

    describe("Tests for main function") {
        it("outputs G'day world") {
            val output = tapSystemOut {
                main(emptyArray())
            }
            output shouldBe "G'day world!\r\n"
        }
    }
})
