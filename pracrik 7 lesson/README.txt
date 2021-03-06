1. class Geometry

    Написать методы, вычисляющие площади геометрических фигур:
    прямоугольника и круга.
    В случае некорректно заданных параметров
    бросать IllegalArgumentException.

    Формулы:
    Периметр прямоугольника: width * height.
    Периметр круга: pi * radius^2, где ^2 - возведение в степень 2.

    Примечание:
    Math.pow(...) - библиотечный метод возведения в степень. ^ в Java имеет другое значение.

    double rectangleArea(double width, double height) { ... }
    double circleArea(double radius) { ... }

    Тестирование:
    Вывести в консоль площади
    1. Для прямоугольника размером 10, 20.
    2. Для прямоугольника размером 30, 20.
    3. Для круга размером 10.
    3. Для круга размером 20.

2. class AreasCalculator

    Написать метод, вычисляющий площади нескольних прямоугольников.
    Для каждого прямоугольника ширина задана в массиве widths, высота в массиве heights,
    а результирующая площадь должна быть записана в результирующий массив.
    Например, для прямоугольника под индексом 2 ширина будет widths[2], высота - heights[2],
    а площадь должна быть записана в результирующий массив под индексом 2.
    В случае, если размеры массивов widths и heights разные, бросить IllegalArgumentException.

    double[] rectangleAreas(double[] widths, double[] heights) { ... }

    Пример:
    rectangleAreas(new double[] {10, 30}, new double[] {20, 20}) ---> {200, 600}

3. class AreasSumCalculator

    Написать метод, вычисляющий суммарную площадь нескольких кругов.
    Для каждого круга радиус задан в массиве radiuses.

    double circleAreasSum(double[] radiuses) { ... }

    Пример:
    circleAreasSum(new double[] {10, 20}) ---> 1570.7963267948967

4. RangeChecker

    Написать метод, определяющий, находятся ли все площади в заданном диапазоне.
    Если minShape > maxShape, бросить IllegalArgumentException.

    boolean isAllInRange(double[] shapes, double minShape, double maxShape) { ... }

    Пример:
    isAllInRange(new double[] {150, 50}, 10, 200) ---> true
    isAllInRange(new double[] {150, 50}, 100, 200) ---> false

5*. RangeFinder

    Написать метод, который находит все площади, находящиеся в заданном диапазоне.
    Если minShape > maxShape, бросить IllegalArgumentException.

    double[] shapesFromRange(double[] shapes, double minShape, double maxShape) { ... }

    Пример:
    shapesFromRange(new double[] {150, 50, 120}, 100, 200) ---> {150, 120}
