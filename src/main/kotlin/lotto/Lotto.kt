package lotto

class Lotto(lottoNumbers: List<LottoNumber>) {

    init {
        require(lottoNumbers.size == VALID_LOTTO_NUMBER_COUNT) { "로또번호 개수가 6개가 아닙니다." }
        require(hasNotDuplicatedLottoNumber(lottoNumbers)) { "중복된 로또번호가 있습니다." }
    }

    private fun hasNotDuplicatedLottoNumber(lottoNumbers: List<LottoNumber>): Boolean {
        return lottoNumbers.distinct().size == VALID_LOTTO_NUMBER_COUNT
    }

    companion object {
        private const val VALID_LOTTO_NUMBER_COUNT = 6
    }
}