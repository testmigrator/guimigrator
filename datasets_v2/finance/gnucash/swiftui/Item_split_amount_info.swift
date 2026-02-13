import SwiftUI

struct Item_split_amount_info: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("Computer").font(.system(size: 14)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
      Text("$ 2000").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
      Text("$ 2000").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 5.0)
    .padding(.bottom, 5.0)
    .padding(.leading, 6.0)
  }
}

struct Item_split_amount_info_Previews: PreviewProvider {
  static var previews: some View {
    Item_split_amount_info()
  }
}
