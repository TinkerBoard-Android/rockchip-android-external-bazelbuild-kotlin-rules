/*
 * * Copyright 2022 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mockito

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito

@RunWith(JUnit4::class)
class MockitoTest {
  @Test
  fun dummyTest() {
    val mocked = Mockito.mock(WithExtensionMethod::class.java)
    assertThat(mocked).isInstanceOf(WithExtensionMethod::class.java)
  }
}

interface WithExtensionMethod {
  fun GenericClass<*>.doSomething()
  fun String.doSomethingElse(arg: GenericClass<*>)
}

open class GenericClass<T>