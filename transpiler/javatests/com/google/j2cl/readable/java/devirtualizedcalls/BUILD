load(
    "//transpiler/javatests/com/google/j2cl/readable:readable_example.bzl",
    "readable_example",
)

package(
    licenses = ["notice"],  # Apache 2.0
)

# Creates verification target
readable_example(
    srcs = glob(["*.java"]),
    # TODO(b/202429268): Support explicit type coercion (there are likely other issuse but this one
    # obsucres them).
    build_kt_readables = False,
)
