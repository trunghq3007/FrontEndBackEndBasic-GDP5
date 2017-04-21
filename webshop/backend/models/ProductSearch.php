<?php

namespace backend\models;

use Yii;
use yii\base\Model;
use yii\data\ActiveDataProvider;
use backend\models\Product;

/**
 * ProductSearch represents the model behind the search form about `backend\models\Product`.
 */
class ProductSearch extends Product
{
    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['idProduct', 'price', 'saleOf', 'startSale', 'endSale', 'priceSale', 'quantity', 'memory', 'screen_pro', 'groups', 'status', 'cate_id', 'supplires_id', 'user_id', 'created_at', 'updated_at'], 'integer'],
            [['productName', 'system_pro', 'image', 'keywords', 'description', 'content'], 'safe'],
        ];
    }

    /**
     * @inheritdoc
     */
    public function scenarios()
    {
        // bypass scenarios() implementation in the parent class
        return Model::scenarios();
    }

    /**
     * Creates data provider instance with search query applied
     *
     * @param array $params
     *
     * @return ActiveDataProvider
     */
    public function search($params)
    {
        $query = Product::find();

        // add conditions that should always apply here

        $dataProvider = new ActiveDataProvider([
            'query' => $query,
        ]);

        $this->load($params);

        if (!$this->validate()) {
            // uncomment the following line if you do not want to return any records when validation fails
            // $query->where('0=1');
            return $dataProvider;
        }

        // grid filtering conditions
        $query->andFilterWhere([
            'idProduct' => $this->idProduct,
            'price' => $this->price,
            'saleOf' => $this->saleOf,
            'startSale' => $this->startSale,
            'endSale' => $this->endSale,
            'priceSale' => $this->priceSale,
            'quantity' => $this->quantity,
            'memory' => $this->memory,
            'screen_pro' => $this->screen_pro,
            'groups' => $this->groups,
            'status' => $this->status,
            'cate_id' => $this->cate_id,
            'supplires_id' => $this->supplires_id,
            'user_id' => $this->user_id,
            'created_at' => $this->created_at,
            'updated_at' => $this->updated_at,
        ]);

        $query->andFilterWhere(['like', 'productName', $this->productName])
            ->andFilterWhere(['like', 'system_pro', $this->system_pro])
            ->andFilterWhere(['like', 'image', $this->image])
            ->andFilterWhere(['like', 'keywords', $this->keywords])
            ->andFilterWhere(['like', 'description', $this->description])
            ->andFilterWhere(['like', 'content', $this->content]);

        return $dataProvider;
    }
}
