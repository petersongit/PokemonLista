package br.com.peterson.pokemons

import android.content.Context
import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_pokemon.view.*

class PokemonAdapter(private val context: Context, private val listPokemons: ArrayList<Pokemon>) : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return `object` == view
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = LayoutInflater.from(context).inflate(R.layout.card_pokemon, container, false)
        var pokemon: Pokemon = listPokemons.get(position)

        view.ivImgPokemon.setImageResource(pokemon.img)
        view.tvNomePokemon.text = pokemon.nome
        view.llPokemon.setBackgroundColor(pokemon.cor)

        
        //container.addView(view, position)
        //container.addView(view, (position - (listPokemons.size - 3)))

        container.addView(view)

        //Toast.makeText(this, "aaaaa", Toast.LENGTH_LONG)


        return view
    }


    override fun getCount(): Int {
        return listPokemons.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView( `object` as View)
    }

}