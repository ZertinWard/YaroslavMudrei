fun main() {
    // 1. Создайте пустой список строк и добавьте в него пять элементов с помощью метода add
    val stringList = mutableListOf<String>()
    stringList.add("42")
    stringList.add("привет")
    stringList.add("пятерка")
    stringList.add("банан")
    stringList.add("апельсин")
    println("Список строк: $stringList")

    // 2. Проверьте, содержится ли заданное значение в списке строк, и выведите результат
    val searchValue = "привет"
    val containsValue = stringList.contains(searchValue)
    println("Список содержит элемент '$searchValue'? $containsValue")

    // 3. Переберите все элементы списка целых чисел с помощью цикла for и выведите каждый элемент
    val intList = listOf(4, 1, 8, 5, 10)
    println("Элементы списка целых чисел:")
    for (number in intList) {
        println(number)
    }

    // 4. Отсортируйте список целых чисел в порядке возрастания и выведите отсортированный список
    val sortedList = intList.sorted()
    println("Отсортированный список: $sortedList")

    // 5. Создайте новый список, содержащий только четные числа из исходного списка целых чисел
    val evenNumbersList = intList.filter { it % 2 == 0 }
    println("Список четных чисел: $evenNumbersList")

    // 6. Подсчитайте количество элементов в списке строк, которые начинаются с заданной буквы
    val startLetter = 'C'
    val count = stringList.count { it.startsWith(startLetter, ignoreCase = true) }
    println("Количество строк, начинающихся с '$startLetter': $count")

    // 7. Изменить знак для всех положительных элементов списка
    val modifiedIntList = intList.map { if (it > 0) -it else it }
    println("Список с измененными знаками: $modifiedIntList")

    // 8. Из имеющегося списка целых чисел, сформировать список их квадратов
    val squaredList = intList.map { it * it }
    println("Список квадратов: $squaredList")
}