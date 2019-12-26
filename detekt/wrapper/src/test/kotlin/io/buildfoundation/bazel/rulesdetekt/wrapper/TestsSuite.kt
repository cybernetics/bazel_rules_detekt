package io.buildfoundation.bazel.rulesdetekt.wrapper

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
        DetektExecutableTests::class,
        OneShotApplicationTests::class,
        WorkerExecutableTests::class,
        WorkerStreamsTests::class
)
class TestsSuite