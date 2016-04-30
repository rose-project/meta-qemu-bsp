#@TYPE: Machine
#@NAME: Qemuarm-bsp common config

#@DESCRIPTION: Common machine configuration for qemu simulation

PREFERRED_PROVIDER_virtual/egl ?= "mesa"
PREFERRED_PROVIDER_virtual/libgl ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles1 ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles2 ?= "mesa"

MACHINE_EXTRA_RRECOMMENDS = " kernel-modules kernel-devicetree"

EXTRA_IMAGEDEPENDS += "u-boot qemu-native qemu-helper-native"

#TODO add ext4
IMAGE_FSTYPES += "tar.bz2"

SERIAL_CONSOLE = "115200 ttyAMA0"

KERNEL_IMAGETYPE = "uImage"
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

UBOOT_SUFFIX = "bin"
UBOOT_ENTRYPOINT = "0x80008000"
UBOOT_LOADADDRESS = "0x80008000"

PREFERRED_PROVIDER_virtual/kernel ?= "linux-stable"
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot"

PREFERRED_VERSION_linux-custom = "v4.0.4"

MACHINE_FEATURES = " \
    usbgadget \
    usbhost \
    keyboard \
    vfat \
    ext2 \
    alsa \
    bluetooth \
    wifi \
    sdio \
    screen \
    "

IMAGE_BOOT_FILES ?= "u-boot.${UBOOT_SUFFIX}"
