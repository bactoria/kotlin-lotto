package lotto

class LottoMachine(private val lottoPrice: Int) {

    init {
        require(lottoPrice > 0) { "로또금액은 0보다 커야합니다" }
    }

    fun sellLottos(money: Int): List<Lotto> {
        val lottoGenerator = RandomLottoGenerator()
        val sellableLottoCount = money / lottoPrice
        return (1..sellableLottoCount).map { lottoGenerator.generate() }
    }
}
