FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "dtc-native"

# This revision corresponds to the tag "v2015.04"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "f33cdaa4c3da4a8fd35aa2f9a3172f31cc887b35"
PV = "v2015.04+git${SRCPV}"

SRC_URI_append = " file://git/configs/qemu_armv7_defconfig "

#do_patch_prepend() {
#    install -m 0644 ${WORKDIR}/configs/qemu_armv7_defconfig ${S}/configs/qemu_armv7_defconfig
#}
