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
    # TODO(b/204793387): Figure out LibraryInfo for J2KT.
    generate_kt_readables = False,
    generate_library_info = True,
    deps = [
        "//third_party:gwt-jsinterop-annotations-j2cl",
    ],
)
