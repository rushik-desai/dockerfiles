define(['./get'], function(get) {

  /** Used as a safe reference for `undefined` in pre-ES5 environments. */
  var undefined;

  /**
   * The base implementation of `_.at` without support for individual paths.
   *
   * @private
   * @param {Object} object The object to iterate over.
   * @param {string[]} paths The property paths of elements to pick.
   * @returns {Array} Returns the picked elements.
   */
  function baseAt(object, paths) {
    var index = -1,
        isNil = object == null,
        length = paths.length,
        result = Array(length);

    while (++index < length) {
      result[index] = isNil ? undefined : get(object, paths[index]);
    }
    return result;
  }

  return baseAt;
});
