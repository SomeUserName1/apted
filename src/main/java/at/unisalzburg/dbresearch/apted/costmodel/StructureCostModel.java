/* MIT License
 *
 * Copyright (c) 2017 Mateusz Pawlik
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package at.unisalzburg.dbresearch.apted.costmodel;

import at.unisalzburg.dbresearch.apted.node.Node;
import at.unisalzburg.dbresearch.apted.node.StringNodeData;

/**
 * This is a unit-nost model, only taking structural differences into account,i.e. ignoring the labels.
 *
 * @see CostModel
 * @see StringNodeData
 */
 // TODO: Use a label dictionary to encode string labels with integers for
 //       faster rename cost computation.
public class StructureCostModel implements CostModel<StringNodeData> {

  /**
   * Calculates the cost of deleting a node.
   *
   * @param n a node considered to be deleted.
   * @return {@code 1} - a fixed cost of deleting a node.
   */
  public float del(Node<StringNodeData> n) {
    return 1.0f;
  }

  /**
   * Calculates the cost of inserting a node.
   *
   * @param n a node considered to be inserted.
   * @return {@code 1} - a fixed cost of inserting a node.
   */
  public float ins(Node<StringNodeData> n) {
    return 1.0f;
  }

  /**
   *    Ignores all costs for renaming.
   *
   * @param n1 a source node for rename.
   * @param n2 a destination node for rename.
   * @return  always 0.
   */
  public float ren(Node<StringNodeData> n1, Node<StringNodeData> n2) {
    return 0.0f;
  }
}
