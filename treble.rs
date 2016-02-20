#![crate_type = "dylib"]

#[no_mangle]
pub extern fn treble(value: i32) -> i32 {
    value * 3
}