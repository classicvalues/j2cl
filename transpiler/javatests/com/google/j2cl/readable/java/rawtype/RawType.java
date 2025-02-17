/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rawtype;

@SuppressWarnings("rawtypes")
class RawType {
  Comparable c;

  interface I<T extends RawType> {
    default void f(T t) {}
  }

  static class Unbound<T> {}

  static class Bound<T extends RawType> {}

  class BoundRecursively<T extends BoundRecursively<T>> {}

  static class RawSubclass implements I {
    @Override
    public void f(RawType t) {}
  }

  void test() {
    Unbound unbound = new Unbound();
    Bound bound = new Bound();
    BoundRecursively boundRecursively = new BoundRecursively();
  }
}
