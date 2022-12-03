package com.fengjunzi.learning.scala.difference.writing

/**
 * @author: Shi, LongCheng
 * @createTime: 3/12/2022$ PM8:00$
 * @version 1.0
 * @description
 */
class simpleDemoWithScala {
  /**
   * scala way to get whether has upper case for 1 string
   * @param name
   * @return true if has upper case, false otherwise
   */
    def nameHasUpperCase(name: String): Boolean = {
      name.exists(_.isUpper)
    }
}
