include recipes-bsp/u-boot/u-boot.inc
DEPENDS += "dtc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

# This revision corresponds to the tag "v2016.07"
# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "25922d42f8e9e7ae503ae55a972ba1404e5b6a8c"

SRC_URI += "file://0001-Set-up-environment-for-OSTree-integration.patch \
	    file://0002-Replace-wraps-with-built-in-code-to-remove-dependenc.patch"

PV = "v2016.07+git${SRCPV}"

EXTRA_OEMAKE_append = " KCFLAGS=-fgnu89-inline"
EXTRA_OEMAKE_append_qemux86 = " KCFLAGS=-fgnu89-inline BUILD_ROM=y"
EXTRA_OEMAKE_append_qemux86-64 = " KCFLAGS=-fgnu89-inline BUILD_ROM=y"

UBOOT_SUFFIX = "bin"
UBOOT_SUFFIX_qemux86 = "rom"
UBOOT_SUFFIX_qemux86-64 = "rom"
