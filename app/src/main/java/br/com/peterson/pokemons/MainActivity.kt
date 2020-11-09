package br.com.peterson.pokemons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  listPokemon: ArrayList<Pokemon>
    lateinit var adapter: PokemonAdapter
    lateinit var actionBar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar = this.supportActionBar!!

        listPokemon = getAllPokemons()
        adapter= PokemonAdapter(this, listPokemon)

        vpPokemon.adapter = adapter
        vpPokemon.setPadding(0, 100, 0, 100)

        //vpPokemon.addOnAdapterChangeListener(ViewPager.OnAdapterChangeListener(){})

/*        vpPokemon.addOnAdapterChangeListener(object : ViewPager.OnPageChangeListener {

        })*/


    }


    //Retorna uma lista de pokemons
    fun getAllPokemons():ArrayList<Pokemon>{
        val p1 = Pokemon(1, "Charmander", R.drawable.charmander, R.color.fogo,  arrayListOf("Fogo"),  arrayListOf("água", "rocha"))
        val p2 = Pokemon(2, "Charmander", R.drawable.charmander, R.color.fogo,  arrayListOf("Fogo"),  arrayListOf("água", "rocha"))
        val p3 = Pokemon(3, "Charmander", R.drawable.charmander, R.color.fogo,  arrayListOf("Fogo"),  arrayListOf("água", "rocha"))

        val listaPokemon = arrayListOf<Pokemon>(p1, p2, p3)

        return listaPokemon
    }
}