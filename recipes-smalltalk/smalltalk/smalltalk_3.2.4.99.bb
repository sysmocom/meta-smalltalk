require ${PN}.inc
PR = "r11.${INC_PR}"

# TODO: Upgrade, package the docs, split the packages, create gst class

SRC_URI = " \
  http://www.secretlabs.de/gnu-smalltalk/smalltalk-3.2.4.99.tar.gz  \
  file://no-doc.patch \
"

SRC_URI[md5sum] = "ab76000aeb212fa556937f45c2315c3f"
SRC_URI[sha256sum] = "4fe3163ac5530272644c16ae8e8e7822cf7712981e5916e24fec871f380f0191"

SRCREV = "c17f4a0f757f398dad3bd90edbf8afdb96c0e995"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

