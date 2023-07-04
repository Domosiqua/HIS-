// 查询列表接口
const getCategoryPage = (params) => {
  return $axios({
    url: '/department/page',
    method: 'get',
    params
  })
}

// 编辑页面反查详情接口
const queryDepartmentById = (id) => {
  return $axios({
    url: `/department/${id}`,
    method: 'get'
  })
}

// 删除当前列的接口
const deleCategory = (id) => {
  return $axios({
    url: '/department/'+id,
    method: 'delete',

  })
}

// 修改接口
const editDepartment = (params) => {
  return $axios({
    url: '/department',
    method: 'put',
    data: { ...params }
  })
}

// 新增接口
const addCategory = (params) => {
  return $axios({
    url: '/department',
    method: 'post',
    data: { ...params }
  })
}
// const queryDtl = () => {
//   return $axios({
//     url: '/department',
//     method: 'get',
//   })
// }