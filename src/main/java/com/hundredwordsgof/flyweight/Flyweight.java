package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {
  // Josh Flowers is editing this file for A14
  void operation(Object extrinsicState);
}
