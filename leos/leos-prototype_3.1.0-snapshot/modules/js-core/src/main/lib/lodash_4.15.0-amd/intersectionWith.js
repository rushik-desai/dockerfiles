define(['./_arrayMap', './_baseIntersection', './_baseRest', './_castArrayLikeObject', './last'], function(arrayMap, baseIntersection, baseRest, castArrayLikeObject, last) {

  /** Used as a safe reference for `undefined` in pre-ES5 environments. */
  var undefined;

  /**
   * This method is like `_.intersection` except that it accepts `comparator`
   * which is invoked to compare elements of `arrays`. Result values are chosen
   * from the first array. The comparator is invoked with two arguments:
   * (arrVal, othVal).
   *
   * @static
   * @memberOf _
   * @since 4.0.0
   * @category Array
   * @param {...Array} [arrays] The arrays to inspect.
   * @param {Function} [comparator] The comparator invoked per element.
   * @returns {Array} Returns the new array of intersecting values.
   * @example
   *
   * var objects = [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }];
   * var others = [{ 'x': 1, 'y': 1 }, { 'x': 1, 'y': 2 }];
   *
   * _.intersectionWith(objects, others, _.isEqual);
   * // => [{ 'x': 1, 'y': 2 }]
   */
  var intersectionWith = baseRest(function(arrays) {
    var comparator = last(arrays),
        mapped = arrayMap(arrays, castArrayLikeObject);

    if (comparator === last(mapped)) {
      comparator = undefined;
    } else {
      mapped.pop();
    }
    return (mapped.length && mapped[0] === arrays[0])
      ? baseIntersection(mapped, undefined, comparator)
      : [];
  });

  return intersectionWith;
});
