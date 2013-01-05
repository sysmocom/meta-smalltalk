require ${PN}.inc
PR = "r11.${INC_PR}"

SRC_URI = " \
  ftp://ftp.gnu.org/gnu/smalltalk/smalltalk-3.2.4.tar.gz \
  file://gst-remote-hostname.patch \
  file://gst-remote-typo.patch \
  file://gst-remote-resume.patch \
  file://fix_clock_behavior_across_image.patch \
  file://fix_fd_resume.patch \
  file://no-doc.patch \
"
SRC_URI[md5sum] = "a36a7c9beddca08dc492b500738efc82"
SRC_URI[sha256sum] = "901cc7090a1fa44bc60900a970d207de4aa3bdfdce72bea55114e243bc1eb1b3"

LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"


